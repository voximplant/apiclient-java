package com.voximplant.apiclient.util;

import com.voximplant.apiclient.ClientException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RequestSerializer {
    public static Map<String, String> serialize(Object o) throws ClientException {

        HashMap<String, String > res = new HashMap<>();

        Method [] methods = o.getClass().getDeclaredMethods();
        for (Method method:methods) {
            if (method.isAnnotationPresent(RequestField.class)) {
                RequestField req = method.getAnnotation(RequestField.class);
                try {
                    String checker = method.getName().startsWith("get") ? method.getName().replaceAll("^get", "has") :
                            method.getName().replaceAll("^is", "has");

                    Method checkerMethod = o.getClass().getDeclaredMethod(checker);
                    Boolean hasValue = (Boolean)checkerMethod.invoke(o);
                    if (!hasValue) {
                        continue;
                    }
                    Object value = method.invoke(o);
                    if (value != null) {
                        SerializeUsing serializer = method.getAnnotation(SerializeUsing.class);
                        if (serializer !=null) {
                            ValueSerializer serializerInstance = (ValueSerializer) serializer.serializer().getConstructors()[0].newInstance();
                            res.put(req.name(), serializerInstance.serialize(value));
                        } else {
                            res.put(req.name(), value.toString());
                        }
                    }
                }
                catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    throw new ClientException("Serialization error", e);
                }
            }
        }
        return res;
    }
}

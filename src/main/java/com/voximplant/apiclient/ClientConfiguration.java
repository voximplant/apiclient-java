package com.voximplant.apiclient;

public class ClientConfiguration {
    private final String credentials;
    private final String protocol;
    private final String apiHost;
    private final String apiPrefix;
    private final long tokenLifespan;

    private ClientConfiguration(String credentials, String protocol, String apiHost, String apiPrefix, long tokenLifespan) {
        this.credentials = credentials;
        this.protocol = protocol;
        this.apiHost = apiHost;
        this.apiPrefix = apiPrefix;
        this.tokenLifespan = tokenLifespan;
    }

    public static ClientConfigurationBuilder builder() {
        return new ClientConfigurationBuilder();
    }

    String getCredentials() {
        return credentials;
    }

    String getProtocol() {
        return protocol;
    }

    String getApiHost() {
        return apiHost;
    }

    String getApiPrefix() {
        return apiPrefix;
    }

    long getTokenLifespan() {
        return tokenLifespan;
    }

    public static class ClientConfigurationBuilder {
        private String credentials;
        private String protocol = "https";
        private String apiHost = "api.voximplant.com";
        private String apiPrefix = "platform_api";
        private long tokenLifespan = 60000L;

        /**
         * Set a Voximplant HTTP API Service account credentials file path
         * @param credentialsPath Path to a JSON file with Voximplant HTTP API Service account credentials. You can get it by visiting
         *                        a <a href="https://manage.voximplant.com/settings/service_accounts">Service accounts</a> page.
         * @return {@link ClientConfigurationBuilder}
         * @see <a href="https://voximplant.com/docs/introduction/introduction_to_voximplant/basic_concepts/service_accounts">Service Accounts help article</a>
         */
        public ClientConfigurationBuilder setCredentialsPath(String credentialsPath) {
            this.credentials = credentialsPath;
            return this;
        }

        /**
         * Set HTTPS as an api calls protocol
         * @return {@link ClientConfigurationBuilder}
         */
        public ClientConfigurationBuilder setHttps() {
            this.protocol = "https";
            return this;
        }

        /**
         * Set HTTP as an api calls protocol
         * @return {@link ClientConfigurationBuilder}
         */
        public ClientConfigurationBuilder setHttp() {
            this.protocol = "http";
            return this;
        }

        /**
         * Set the Voximplant HTTP API host
         * @param apiHost
         * @return {@link ClientConfigurationBuilder}
         */
        public ClientConfigurationBuilder setApiHost(String apiHost) {
            this.apiHost = apiHost;
            return this;
        }

        /**
         * Set the Voximplant HTTP API prefix
         * @param apiPrefix
         * @return {@link ClientConfigurationBuilder}
         */
        public ClientConfigurationBuilder setApiPrefix(String apiPrefix) {
            this.apiPrefix = apiPrefix;
            return this;
        }

        /**
         * Set a JWT token lifespan to reuse previously generated. Defaults to 60s
         * @param tokenLifespan JWT Token lifespan in milliseconds. Keep in mind we have some network latency compensation
         * @return {@link ClientConfigurationBuilder}
         */
        public ClientConfigurationBuilder setTokenLifespanMs(long tokenLifespan) {
            this.tokenLifespan = tokenLifespan;
            return this;
        }

        public ClientConfiguration build() {
            return new ClientConfiguration(credentials, protocol, apiHost, apiPrefix, tokenLifespan);
        }
    }
}

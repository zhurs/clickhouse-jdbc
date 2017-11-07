package ru.yandex.clickhouse;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jackson {
    private static class Holder {
        private static final ObjectMapper OBJECT_MAPPER;

        static {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            OBJECT_MAPPER = mapper;
        }
    }

    /**
     * Singleton objectMapper.  Users of this should not keep a reference to this.
     *
     * @return an ObjectMapper
     */
    public static ObjectMapper getObjectMapper() {
        return Holder.OBJECT_MAPPER;
    }
}

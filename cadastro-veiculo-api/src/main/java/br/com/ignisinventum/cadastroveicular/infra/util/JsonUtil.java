package br.com.ignisinventum.cadastroveicular.infra.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

@SuppressWarnings("deprecation")
public class JsonUtil {

	private static ObjectMapper m = new ObjectMapper(new JsonFactory());

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

	private JsonUtil() {

	}

	static {
		m.setVisibilityChecker(VisibilityChecker.Std.defaultInstance().withFieldVisibility(Visibility.ANY));
		m.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		m.setSerializationInclusion(Include.NON_NULL);
		m.enable(SerializationFeature.INDENT_OUTPUT);
	}

	public static String toJson(Object obj) {
		try {
			return m.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}

	public static <T> T fromJson(String json, Class<T> valueType) {
		try {
			return m.readValue(json, valueType);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}

}

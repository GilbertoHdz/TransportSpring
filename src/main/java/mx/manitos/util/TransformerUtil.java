package mx.manitos.util;


import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class TransformerUtil {
	
	private static String formatoFecha = "yyyy-MM-dd";
	private static DateFormat dateFormatter = null;

	private TransformerUtil() {

	}

	public static synchronized DateFormat getDateFormatter() {
		if (dateFormatter == null) {
			dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		}
		return dateFormatter;
	}

	public static Long longValue(Map<String, Object> result, String key) {
		Object object = result.get(key);
		return object != null ? ((Number) object).longValue() : null;
	}

	public static BigDecimal bigDecimalValue(Map<String, Object> result, String key) {
		Object object = result.get(key);
		if (object instanceof BigDecimal) {
			return (BigDecimal) object;
		} else if (object instanceof String) {
			return new BigDecimal((String) object);
		} else {
			return null;
		}
	}

	public static String stringValue(Map<String, Object> result, String key) {
		Object object = result.get(key);
		return object != null ? object.toString() : null;
	}

	public static synchronized Date dateValue(Map<String, Object> result, String key) {
		Date date = null;
		String value = stringValue(result, key);
		if (value != null) {
			try {
				date = getDateFormatter().parse(value);
			} catch (ParseException parseException) {

			}
		}
		return date;
	}

	public static synchronized Date dateValue(String value) {
		Date date = null;
		try {
			date = getDateFormatter().parse(value);
		} catch (ParseException parseException) {

		}

		return date;
	}

	public static Integer intValue(Map<String, Object> result, String key) {
		Object object = result.get(key);
		return object != null ? ((Number) object).intValue() : null;
	}
	
	public static Double doubleValue(Map<String, Object> result, String key) {
		Object object = result.get(key);
		return object != null ? ((Number) object).doubleValue() : null;//
	}

	public static String getFormatoFecha() {
		return formatoFecha;
	}

	public static synchronized String getFechaConFormato(Date fecha) {
		return getDateFormatter().format(fecha);
	}

	public static synchronized String getJSONFromObject(Object pObject) {
		// Se manda en JSON la categoria.
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writeValueAsString(pObject);
		} catch (Exception ex) {
		}
		return json;
	}

	public static synchronized String getJSONWithViewFromObject(Object pObject) {
		// Se manda en JSON la categoria.
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			mapper.disable(MapperFeature.DEFAULT_VIEW_INCLUSION);
			// json = mapper.writerWithView(View.Summary.class)
			// .writeValueAsString(pObject);

		} catch (Exception ex) {
		}
		return json;
	}

//	public static synchronized Token getTokenToJSON(String token) {
//		// Se manda en JSON la categoria.
//		ObjectMapper mapper = new ObjectMapper();
//		Token oReturn = null;
//		try {
//			oReturn = mapper.readValue(token, Token.class);
//
//		} catch (Exception ex) {
//		}
//		return oReturn;
//	}
	
}

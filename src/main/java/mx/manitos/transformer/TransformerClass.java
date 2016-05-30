package mx.manitos.transformer;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import mx.manitos.from.FromClass;
import mx.manitos.util.TransformerUtil;

import org.hibernate.transform.BasicTransformerAdapter;

public class TransformerClass extends BasicTransformerAdapter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String KEY_ORDER_ID = "ORDER_ID";
	private static final String KEY_SHI_NAME = "SHIP_NAME";
	private static final String KEY_CUSTOMER_C = "CUSTOMER_CODE";
	private static final String KEY_CONTACT_NAME = "CONTACT_NAME";
	
	public TransformerClass(){
		
	}
	
	public Object transformTuple(Object[] tuple, String[] aliases) {
		
		Map<String, Object> result = new HashMap<String, Object>(tuple.length);
		for (int i = 0; i < tuple.length; i++) {
			String alias = aliases[i];
			if (alias != null) {
				result.put(alias, tuple[i]);
			}
		}
		
		FromClass tranformClass = new FromClass();
		
		tranformClass.setOrderID(TransformerUtil.stringValue(result, KEY_ORDER_ID));
		tranformClass.setShipName(TransformerUtil.stringValue(result, KEY_SHI_NAME));
		tranformClass.setCustomerCode(TransformerUtil.stringValue(result, KEY_CUSTOMER_C));
		tranformClass.setContactName(TransformerUtil.stringValue(result, KEY_CONTACT_NAME));
		
		return tranformClass;
	}
	
}

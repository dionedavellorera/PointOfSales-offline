package nerdvana.com.pointofsales.api_requests;

import java.util.HashMap;
import java.util.Map;

public class FetchCreditCardRequest extends BaseRequest{
    private Map<String, String> mapValue;

    public FetchCreditCardRequest() {
        mapValue = new HashMap<>();
        mapValue.put("currency_id", currencyId);
        mapValue.put("currency_value", currencyValue);
        mapValue.put("user_id", userId);
        mapValue.put("pos_id", machineNumber);
        mapValue.put("branch_code", branchCode);
    }

    public Map<String, String> getMapValue() {
        return mapValue;
    }
}


package mfajar8.wordpress.pahlawanku.Models;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PahlawanModels {

    private String status;
    private String message;
    private Integer total_result;
    private List<ResultPahlawan> results = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotal_result() {
        return total_result;
    }

    public void setTotal_result(Integer total_result) {
        this.total_result = total_result;
    }

    public List<ResultPahlawan> getResults() {
        return results;
    }

    public void setResults(List<ResultPahlawan> results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

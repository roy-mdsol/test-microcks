
package org.roy.beans;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "visitId",
    "description"
})
@Generated("jsonschema2pojo")
public class Visit {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("visitId")
    @JsonPropertyDescription("")
    private Integer visitId;
    /**
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("")
    private String description;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("visitId")
    public Integer getVisitId() {
        return visitId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("visitId")
    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    /**
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

}

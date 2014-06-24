package app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@JsonIgnoreProperties(ignoreUnknown = true)
@MappedSuperclass
public class EntityForm {
    @Column(name = "anm_id")
    @JsonProperty("anmId")
    private String anmId;

    @Column(name = "instance_id")
    @JsonProperty("instanceId")
    private String instanceId;

    @Column(name = "entity_id")
    @JsonProperty("entityId")
    private String entityId;

    @Column(name = "form_name")
    @JsonProperty("formName")
    private String formName;

    @Column(name = "client_version")
    @JsonProperty("clientVersion")
    private String clientVersion;

    @Column(name = "server_version")
    @JsonProperty("serverVersion")
    private String serverVersion;

    @Column(name = "form_data_definition_version")
    @JsonProperty("formDataDefinitionVersion")
    private String formDataDefinitionVersion;
}
package app.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "pnc_close")
public class PncClose extends EntityForm {
    @Id
    @Column(name = "pnc_close_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pncCloseId;

    @Column(name = "id")
    @JsonProperty("id")
    private String id;

    @Column(name = "close_reason")
    @JsonProperty("closeReason")
    private String closeReason;

    @Column(name = "death_date")
    @JsonProperty("deathDate")
    private String deathDate;

    @Column(name = "is_maternal_death")
    @JsonProperty("isMaternalDeath")
    private String isMaternalDeath;

    @Column(name = "maternal_death_cause")
    @JsonProperty("maternalDeathCause")
    private String maternalDeathCause;

    @Column(name = "other_maternal_death_cause")
    @JsonProperty("otherMaternalDeathCause")
    private String otherMaternalDeathCause;

    @Column(name = "is_pnc_close_confirmed")
    @JsonProperty("isPNCCloseConfirmed")
    private String isPNCCloseConfirmed;

    @Column(name = "submission_date")
    @JsonProperty("submissionDate")
    private String submissionDate;

}
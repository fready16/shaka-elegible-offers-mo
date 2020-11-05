package com.telefonica.eom.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telefonica.eom.generated.model.MobileQuotaCharacteristicTypeDataQuota;
import com.telefonica.eom.generated.model.MobileQuotaCharacteristicTypeSmsQuota;
import com.telefonica.eom.generated.model.MobileQuotaCharacteristicTypeVoiceQuota;
import com.telefonica.eom.generated.model.ObjectCharacteristicValueType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MobileQuota
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-12T21:43:17.267Z")




public class MobileQuota extends ObjectCharacteristicValueType  {
  @JsonProperty("voiceQuota")
  @Valid
  private List<MobileQuotaCharacteristicTypeVoiceQuota> voiceQuota = null;

  @JsonProperty("dataQuota")
  @Valid
  private List<MobileQuotaCharacteristicTypeDataQuota> dataQuota = null;

  @JsonProperty("smsQuota")
  @Valid
  private List<MobileQuotaCharacteristicTypeSmsQuota> smsQuota = null;

  public MobileQuota voiceQuota(List<MobileQuotaCharacteristicTypeVoiceQuota> voiceQuota) {
    this.voiceQuota = voiceQuota;
    return this;
  }

  public MobileQuota addVoiceQuotaItem(MobileQuotaCharacteristicTypeVoiceQuota voiceQuotaItem) {
    if (this.voiceQuota == null) {
      this.voiceQuota = new ArrayList<MobileQuotaCharacteristicTypeVoiceQuota>();
    }
    this.voiceQuota.add(voiceQuotaItem);
    return this;
  }

  /**
   * Get voiceQuota
   * @return voiceQuota
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MobileQuotaCharacteristicTypeVoiceQuota> getVoiceQuota() {
    return voiceQuota;
  }

  public void setVoiceQuota(List<MobileQuotaCharacteristicTypeVoiceQuota> voiceQuota) {
    this.voiceQuota = voiceQuota;
  }

  public MobileQuota dataQuota(List<MobileQuotaCharacteristicTypeDataQuota> dataQuota) {
    this.dataQuota = dataQuota;
    return this;
  }

  public MobileQuota addDataQuotaItem(MobileQuotaCharacteristicTypeDataQuota dataQuotaItem) {
    if (this.dataQuota == null) {
      this.dataQuota = new ArrayList<MobileQuotaCharacteristicTypeDataQuota>();
    }
    this.dataQuota.add(dataQuotaItem);
    return this;
  }

  /**
   * Get dataQuota
   * @return dataQuota
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MobileQuotaCharacteristicTypeDataQuota> getDataQuota() {
    return dataQuota;
  }

  public void setDataQuota(List<MobileQuotaCharacteristicTypeDataQuota> dataQuota) {
    this.dataQuota = dataQuota;
  }

  public MobileQuota smsQuota(List<MobileQuotaCharacteristicTypeSmsQuota> smsQuota) {
    this.smsQuota = smsQuota;
    return this;
  }

  public MobileQuota addSmsQuotaItem(MobileQuotaCharacteristicTypeSmsQuota smsQuotaItem) {
    if (this.smsQuota == null) {
      this.smsQuota = new ArrayList<MobileQuotaCharacteristicTypeSmsQuota>();
    }
    this.smsQuota.add(smsQuotaItem);
    return this;
  }

  /**
   * Get smsQuota
   * @return smsQuota
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MobileQuotaCharacteristicTypeSmsQuota> getSmsQuota() {
    return smsQuota;
  }

  public void setSmsQuota(List<MobileQuotaCharacteristicTypeSmsQuota> smsQuota) {
    this.smsQuota = smsQuota;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MobileQuota mobileQuota = (MobileQuota) o;
    return Objects.equals(this.voiceQuota, mobileQuota.voiceQuota) &&
        Objects.equals(this.dataQuota, mobileQuota.dataQuota) &&
        Objects.equals(this.smsQuota, mobileQuota.smsQuota) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voiceQuota, dataQuota, smsQuota, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MobileQuota {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    voiceQuota: ").append(toIndentedString(voiceQuota)).append("\n");
    sb.append("    dataQuota: ").append(toIndentedString(dataQuota)).append("\n");
    sb.append("    smsQuota: ").append(toIndentedString(smsQuota)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


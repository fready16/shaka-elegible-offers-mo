package com.telefonica.eom.generated.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.telefonica.eom.generated.model.ConnectionType;
import com.telefonica.eom.generated.model.ObjectCharacteristicValueType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InternetConnection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-10-12T21:43:17.267Z")




public class InternetConnection extends ObjectCharacteristicValueType  {
  @JsonProperty("connection")
  private ConnectionType connection = null;

  public InternetConnection connection(ConnectionType connection) {
    this.connection = connection;
    return this;
  }

  /**
   * Information for broadband/internet type products, providing details on connections characteristics
   * @return connection
  **/
  @ApiModelProperty(required = true, value = "Information for broadband/internet type products, providing details on connections characteristics")
  @NotNull

  @Valid

  public ConnectionType getConnection() {
    return connection;
  }

  public void setConnection(ConnectionType connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternetConnection internetConnection = (InternetConnection) o;
    return Objects.equals(this.connection, internetConnection.connection) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connection, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternetConnection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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


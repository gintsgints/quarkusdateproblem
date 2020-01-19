package org.acme;

import javax.json.bind.annotation.JsonbDateFormat;
import java.sql.Date;

public class Example {
  public Date getTest() {
    return test;
  }

  public void setTest(Date test) {
    this.test = test;
  }

  @JsonbDateFormat(value = "yyyy-MM-dd")
  private Date test;
}

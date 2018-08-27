package uk.co.whitbread.exercise.providers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Util {

  public static String getPayload(String file) throws IOException {
    InputStream is = Util.class
        .getResourceAsStream(file);
    BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
    String line = null;
    StringBuffer sb = new StringBuffer();
    while ((line = br.readLine()) != null) {
      sb.append(line).append("\n");
    }
    return sb.toString();
  }

}

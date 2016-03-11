package hello;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by liuyong on 2016/3/11.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

        private String type;
        private JsonFormat.Value value;

        public Quote() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public JsonFormat.Value getValue() {
            return value;
        }

        public void setValue(JsonFormat.Value value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Quote{" +
                    "type='" + type + '\'' +
                    ", value=" + value +
                    '}';
        }
}

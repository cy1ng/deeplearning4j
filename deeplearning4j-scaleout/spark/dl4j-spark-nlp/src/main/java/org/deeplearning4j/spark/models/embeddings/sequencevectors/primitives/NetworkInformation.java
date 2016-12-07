package org.deeplearning4j.spark.models.embeddings.sequencevectors.primitives;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author raver119@gmail.com
 */
@NoArgsConstructor
@Data
public class NetworkInformation implements Serializable {
    protected long totalMemory = 0;
    protected long availableMemory = 0;
    protected List<String> ipAddresses = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NetworkInformation that = (NetworkInformation) o;

        return ipAddresses != null ? ipAddresses.equals(that.ipAddresses) : that.ipAddresses == null;
    }

    @Override
    public int hashCode() {
        return ipAddresses != null ? ipAddresses.hashCode() : 0;
    }
}

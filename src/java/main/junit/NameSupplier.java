package main.junit;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/11/25.
 */
public class NameSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
        PotentialAssignment nameAssignment1 = PotentialAssignment.forValue("name", "Tony");
        PotentialAssignment nameAssignment2 = PotentialAssignment.forValue("name", "Jim");
        return Arrays.asList(new PotentialAssignment[]{nameAssignment1, nameAssignment2});
    }

}

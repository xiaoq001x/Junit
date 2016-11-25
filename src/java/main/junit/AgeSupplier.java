package main.junit;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/11/25.
 */
public class AgeSupplier extends ParameterSupplier {
    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) {
        PotentialAssignment ageAssignment1 = PotentialAssignment.forValue("age", 10);
        PotentialAssignment ageAssignment2 = PotentialAssignment.forValue("age", 20);
        return Arrays.asList(new PotentialAssignment[]{ageAssignment1, ageAssignment2});
    }
}

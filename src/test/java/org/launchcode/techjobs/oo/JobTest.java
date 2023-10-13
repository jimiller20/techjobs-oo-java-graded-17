package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.runner.notification.RunListener;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Janice", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job1.getEmployer() instanceof Employer);

        String name = job1.getName();
        String employer = String.valueOf(job1.getEmployer());
        String location = String.valueOf(job1.getLocation());
        String position = String.valueOf(job1.getPositionType());
        String coreCompetency = String.valueOf(job1.getCoreCompetency());

        assertEquals(name, "Janice");
        assertEquals(employer, "ACME");
        assertEquals(location, "Desert");
        assertEquals(position, "Quality control");
        assertEquals(coreCompetency, "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Janice", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Janice", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        boolean results = job1.equals(job2);
        assertFalse(results);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Janice", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job jobEmpty = new Job();

        String results = job1.toString();
        String resultsEmpty = jobEmpty.toString();
        char newLine = '\n';
        int totalIndex = results.length();
        assertEquals(results.charAt(0), newLine);
        assertEquals(results.charAt(totalIndex - 1), newLine);
        String format = newLine + "ID: " + job1.getId() + newLine + "Name: " + job1.getName() +
                newLine +  "Employer: " + job1.getEmployer() + newLine + "Location: " + job1.getLocation() + newLine +
                "Position Type: " + job1.getPositionType() + newLine + "Core Competency: " + job1.getCoreCompetency() +
                newLine;
        assertEquals(results, format);
        assertEquals(resultsEmpty, "Data not available");
    }


    @Test
    public void testToStringHandlesEmptyField() {

    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {

    }
}

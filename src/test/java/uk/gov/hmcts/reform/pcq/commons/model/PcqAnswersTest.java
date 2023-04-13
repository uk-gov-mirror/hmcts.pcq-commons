package uk.gov.hmcts.reform.pcq.commons.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PcqAnswersTest {

    @Test
    void testPcqAnswers() {
        PcqAnswers answers = new PcqAnswers();
        addTestAnswers(answers);
        assertAnswers(answers);
    }

    private void addTestAnswers(PcqAnswers answers) {
        answers.setDisabilityConditionOther("TEST_DIS_OTHER");
        answers.setDisabilityConditions(1);
        answers.setDisabilityDexterity(0);
        answers.setDisabilityHearing(2);
        answers.setDisabilityImpact(1);
        answers.setDisabilityLearning(2);
        answers.setDisabilityMemory(0);
        answers.setDisabilityMentalHealth(3);
        answers.setDisabilityMobility(1);
        answers.setDisabilityNone(2);
        answers.setDisabilityOther(0);
        answers.setDisabilitySocial(2);
        answers.setDisabilityStamina(1);
        answers.setDisabilityVision(0);
        answers.setDob("01-01-1900");
        answers.setDobProvided(1);
        answers.setEnglishLanguageLevel(1);
        answers.setEthnicity(2);
        answers.setEthnicityOther("OK");
        answers.setGenderDifferent(2);
        answers.setGenderOther("OtherG");
        answers.setLanguageMain(1);
        answers.setLanguageOther("Lang1");
        answers.setMarriage(1);
        answers.setPregnancy(2);
        answers.setReligion(1);
        answers.setReligionOther("CDS");
        answers.setSex(2);
        answers.setSexuality(4);
        answers.setSexualityOther("Other");
        answers.setOptOut(false);
    }

    private void assertAnswers(PcqAnswers answers) {
        assertEquals("TEST_DIS_OTHER", answers.getDisabilityConditionOther(),
                "Other Disability Condition is not matching");
        assertEquals(1, answers.getDisabilityConditions().intValue(),
                "Disability Conditions is not matching");
        assertEquals(0, answers.getDisabilityDexterity().intValue(),
                "Disability Dexterity is not matching");
        assertEquals(2, answers.getDisabilityHearing().intValue(),
                "Disability Hearing is not matching");
        assertEquals(1, answers.getDisabilityImpact().intValue(),
                "Disability Impact is not matching");
        assertEquals(2, answers.getDisabilityLearning().intValue(),
                "Disability Learning is not matching");
        assertEquals(0, answers.getDisabilityMemory().intValue(),
                "Disability Memory is not matching");
        assertEquals(3, answers.getDisabilityMentalHealth().intValue(),
                "Disability Mental Health is not matching");
        assertEquals(1, answers.getDisabilityMobility().intValue(),
                "Disability Mobility is not matching");
        assertEquals(2, answers.getDisabilityNone().intValue(),
                "Disability None is not matching");
        assertEquals(0, answers.getDisabilityOther().intValue(),
                "Disability Other is not matching");
        assertEquals(2, answers.getDisabilitySocial().intValue(),
                "Disability Social is not matching");
        assertEquals(1, answers.getDisabilityStamina().intValue(),
                "Disability Stamina is not matching");
        assertEquals(0, answers.getDisabilityVision().intValue(),
                "Disability Vision is not matching");
        assertEquals("01-01-1900", answers.getDob(),
                "Dob is not matching");
        assertEquals(1, answers.getDobProvided().intValue(),
                "Dob Provided is not matching");
        assertEquals(1, answers.getEnglishLanguageLevel().intValue(),
                "English Language level is not matching");
        assertEquals(2, answers.getEthnicity().intValue(),
                "Ethnicity is not matching");
        assertEquals("OK", answers.getEthnicityOther(),
                "Ethnicity Other is not matching");
        assertEquals(2, answers.getGenderDifferent().intValue(),
                "Gender Different is not matching");
        assertEquals("OtherG", answers.getGenderOther(),
                "Gender Other is not matching");
        assertEquals(1, answers.getLanguageMain().intValue(),
                "Main Language is not matching");
        assertEquals("Lang1", answers.getLanguageOther(),
                "Language other is not matching");
        assertEquals(1, answers.getMarriage().intValue(),
                "Marriage is not matching");
        assertEquals(2, answers.getPregnancy().intValue(),
                "Pregnancy is not matching");
        assertEquals(1, answers.getReligion().intValue(),
                "Religion is not matching");
        assertEquals("CDS", answers.getReligionOther(),
                "Religion Other is not matching");
        assertEquals(2, answers.getSex().intValue(),
                "Sex is not matching");
        assertEquals(4, answers.getSexuality().intValue(),
                "Sexuality is not matching");
        assertEquals("Other", answers.getSexualityOther(),
                "Sexuality Other is not matching");
        assertEquals(false, answers.getOptOut(),
                "OptOut is not matching");
    }
}

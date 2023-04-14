package uk.gov.hmcts.reform.pcq.commons.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PcqRecordWithoutCaseResponseTest {
    private static final String STATUS = "Success";
    private static final String STATUS_CODE = "200";

    @Test
    void testPcqRecordWithoutCaseResponse() {
        PcqRecordWithoutCaseResponse pcqRecordWithoutCaseResponse = new PcqRecordWithoutCaseResponse();
        PcqAnswerResponse answerResponse1 = generateTestAnswer("PCQ_ID1", "SERVICE_JD1", "ACTOR_1");
        PcqAnswerResponse answerResponse2 = generateTestAnswer("PCQ_ID2", "SERVICE_JD2", "ACTOR_2");

        PcqAnswerResponse[] answerResponses = {answerResponse1, answerResponse2};
        pcqRecordWithoutCaseResponse.setPcqRecord(answerResponses);
        pcqRecordWithoutCaseResponse.setResponseStatus(STATUS);
        pcqRecordWithoutCaseResponse.setResponseStatusCode(STATUS_CODE);

        assertPcqRecordsEqual(answerResponses, pcqRecordWithoutCaseResponse.getPcqRecord());
        assertEquals(STATUS, pcqRecordWithoutCaseResponse.getResponseStatus(),
                "Response status doesn't match");
        assertEquals(STATUS_CODE, pcqRecordWithoutCaseResponse.getResponseStatusCode(),
                "Response status code doesn't match");
    }

    @SuppressWarnings("PMD.UseVarargs")
    private void assertPcqRecordsEqual(PcqAnswerResponse[] originalAnswers, PcqAnswerResponse[] responseAnswers) {
        assertEquals(originalAnswers.length, responseAnswers.length,"Pcq Answers Array Length don't match");
        for (int i = 0; i < originalAnswers.length; i++) {
            assertEquals(originalAnswers[i].getPcqId(), responseAnswers[i].getPcqId(),"PCQ Ids don't match");
            assertEquals(originalAnswers[i].getServiceId(),
                    responseAnswers[i].getServiceId(),"Service Ids don't match");
            assertEquals(originalAnswers[i].getActor(), responseAnswers[i].getActor(),"Actors don't match");
        }
    }

    private PcqAnswerResponse generateTestAnswer(String pcqId, String serviceId, String actor) {
        PcqAnswerResponse answerResponse = new PcqAnswerResponse();
        answerResponse.setPcqId(pcqId);
        answerResponse.setServiceId(serviceId);
        answerResponse.setActor(actor);

        return answerResponse;
    }
}

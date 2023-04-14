package uk.gov.hmcts.reform.pcq.commons.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class PcqAnswerResponseTest {

    private static final String PCQ_ID = "TEST_PCQ";
    private static final String CASE_ID = "CASE_ID";
    private static final String PARTY_ID = "PARTY_ID";
    private static final Integer CHANNEL = 1;
    private static final String SERVICE_ID = "Service_1";
    private static final String ACTOR = "Actor_1";
    private static final Integer VERSION_NO = 1;

    @Test
    void testPcqAnswerResponse() {
        PcqAnswerResponse answerResponse = new PcqAnswerResponse();
        answerResponse.setActor(ACTOR);
        answerResponse.setServiceId(SERVICE_ID);
        answerResponse.setPcqId(PCQ_ID);
        answerResponse.setCaseId(CASE_ID);
        answerResponse.setChannel(CHANNEL);
        answerResponse.setCompletedDate(null);
        answerResponse.setPartyId(PARTY_ID);
        answerResponse.setVersionNo(VERSION_NO);
        answerResponse.setPcqAnswers(null);

        assertEquals(ACTOR, answerResponse.getActor(),"Actor is not matching");
        assertEquals(SERVICE_ID, answerResponse.getServiceId(),"Service is not matching");
        assertEquals(PCQ_ID, answerResponse.getPcqId(),"PCQ ID is not matching");
        assertEquals(CASE_ID, answerResponse.getCaseId(),"Case ID is not matching");
        assertEquals(CHANNEL, answerResponse.getChannel(),"Channel is not matching");
        assertNull(answerResponse.getCompletedDate(),"Completed Date is not null");
        assertEquals(PARTY_ID, answerResponse.getPartyId(),"Party is not matching");
        assertEquals(VERSION_NO, answerResponse.getVersionNo(),"Version is not matching");
        assertNull(answerResponse.getPcqAnswers(),"Pcq Answer is not null");
    }
}

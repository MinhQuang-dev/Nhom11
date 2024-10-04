import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestError {

    @Test
    public void testError() {
        ResponseError responseError;
        RequestData requestData = new RequestData();
        requestData.number1 = "2";
        requestData.number2 = "a";

        AddUseCaseControl addUseCaseControl = new AddUseCaseControl();
        addUseCaseControl.execute(requestData);
        responseError = addUseCaseControl.getResError();

        assertEquals("ERROR_INPUT", responseError.content);

        
    }

}

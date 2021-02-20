package com.mahefa.showcase;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import generated.jaxb.mahefa.showcase.producing_ws.GetFactorialReponse;
import generated.jaxb.mahefa.showcase.producing_ws.GetFactorialRequest;

@Endpoint
public class CalculatorEndpoint {
	
	@PayloadRoot(namespace="http://esti.mg/master/m2/msi/910", localPart="getFactorialRequest")
	@ResponsePayload
	public GetFactorialReponse getFactorial(@RequestPayload GetFactorialRequest getFactorialRequest) {
		int result = this.factorial( getFactorialRequest.getNb() );
		
		GetFactorialReponse getFactorialReponse = new GetFactorialReponse();
		getFactorialReponse.setNb(getFactorialRequest.getNb());
		getFactorialReponse.setResult(result);
		return getFactorialReponse;
	}
	
	private int factorial(int nb) {
		if(nb > 1)
			return nb * this.factorial(nb-1);
		else
			return 1;
	}
	
}

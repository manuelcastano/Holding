package model;

/**
*to save the information for a poll
*/
public class Poll{
	
	private int serviceRendered;
	private int responseTime;
	private int costBenefit;
	
	/**
	*Poll constructor
	*@param serviceRendered the calification for the service
	*@param responseTime the calification for the response time
	*@param costBenefit the calification for the costBenefit
	*/
	public Poll(int serviceRendered, int responseTime, int costBenefit){
		this.serviceRendered = serviceRendered;
		this.responseTime = responseTime;
		this.costBenefit = costBenefit;
	}
	
	/**
	*Gets the calification for the service
	*@return the calification for the service
	*/
	public int getServiceRendered(){
		return serviceRendered;
	}
	
	/**
	*Sets the calification for the service
	*@param serviceRendered the calification for the service
	*/
	public void setServiceRendered(int serviceRendered){
		this.serviceRendered = serviceRendered;
	}
	
	/**
	*Gets the calification for the response time
	*@return the calification for the response time
	*/
	public int getResponseTime(){
		return responseTime;
	}
	
	/**
	*Sets the calification for the response time
	*@param responseTime the calification for the response time
	*/
	public void setResponseTime(int responseTime){
		this.responseTime = responseTime;
	}
	
	/**
	*Gets the calification for the cost-benefit
	*@return the calification for the cost-benefit
	*/
	public int getCostBenefit(){
		return costBenefit;
	}
	
	/**
	*Sets the calification for the cost benefit
	*@param costBenefit the calification for the cost benefit
	*/
	public void setCostBenefit(int costBenefit){
		this.costBenefit = costBenefit;
	}
}
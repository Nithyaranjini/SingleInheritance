package org.company;

import org.client.Client;

public class CompanyInfo extends Client{
	private void companyName() {
		System.out.println("Tata Communications Ltd");}
	private void companyId() {
		System.out.println("Tata 234567");}
	private void companyAddress() {
	    System.out.println("Tata Communication Ltd Sholinganallur,Chennai");}
    
    public static void main(String[] args) {
		CompanyInfo details = new CompanyInfo();
		details.companyName();
		details.companyId();
		details.companyAddress();
		details.clientName();
				
	}
}

	

	

	

	



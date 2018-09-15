package sample.cycleclub.club.controller;

import sample.cycleclub.club.service.IClubService;

/**
 * @author LSH
 * @version 1.0
 * @created 09-8-2015 ���� 11:12:57
 */
public class ClubController {

	public IClubService m_IClubService;

	public ClubController(){
		System.out.println("Test");
	}

	public void finalize() throws Throwable {

	}

	public String insert(){
		return "";
	}

}
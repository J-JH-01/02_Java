package edu.kh.network.server.run;

import edu.kh.network.server.model.dto.ServerService;

public class ServerRun {
	public static void main(String[] args) {
		new ServerService().serverStart();
	}
}

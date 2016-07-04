package com.panduit.poc;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class LineProcess {
	private Line[] lines;

	public Line[] getLines() {
		return lines;
	}

	public void setLines(Line[] lines) {
		this.lines = lines;
	}
	
	
}

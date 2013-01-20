/*******************************************************************************
 * Copyright (c) 2011 Jordan Thoms.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package biz.shadowservices.DegreesToolbox;

public class Line {
	// Used when constructing the lines for the widgets.
	private String lineContent;
	private float size = -1;
	Line(String lineContent) {
		this.lineContent = lineContent;
	}
	String getLineContent() {
		return lineContent;
	}
	void setSize(float size) {
		this.size = size;
	}
	float getSize() {
		return size;
	}
}
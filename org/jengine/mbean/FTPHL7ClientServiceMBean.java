/*
 * 	JEngine Copyright (C) 2006
 *  Jacek Zagorski, Shasta NetWorks LLC
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 */

package org.jengine.mbean;

import org.jboss.system.ServiceMBean;

public interface FTPHL7ClientServiceMBean extends ServiceMBean
{
	
	public static final String OBJECT_NAME = ":service=Interface";
	
	public String getIPAddress();
	public String getHostname();
	public void setHostname(String s);
    
	public void setUsername(String s);
	public String getUsername();

	public void setPassword(String s);
	public String getPassword();

	public void setPollInterval(int n);
	public int getPollInterval();

	public void setWorkingDirectory(String s);
	public String getWorkingDirectory();

	public void setWorkingDirectoryLocal(String s);
	public String getWorkingDirectoryLocal();

	public void setPassiveMode(boolean b);
	public boolean getPassiveMode();

	public void setDefaultDateFormatStr(String s);
    public String getDefaultDateFormatStr();
    
    public void setRecentDateFormatStr(String s);
    public String getRecentDateFormatStr();

	public void setIFName(String s);
	public String getIFName();
	
	public int getBacklog();
	public void setBacklog(int backlog);
	
	public void setQueues(String s);
	public String getQueues();

	//GETTERS
	public boolean getConnectionStatus();
	public int getNumberMessages();
	public String getTimeStampLastMsg();
	
}

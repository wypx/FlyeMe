/******************************************************************
*
*	MediaServer for CyberLink
*
*	Copyright (C) Satoshi Konno 2003-2004
*
*	File: ConnectionInfoList.java
*
*	Revision;
*
*	02/22/08
*		- first revision.
*
******************************************************************/

package me.smart.flyme.upnp.dlna.renderer;

import java.util.Vector;

public class ConnectionInfoList extends Vector 
{
	////////////////////////////////////////////////
	// Constrictor
	////////////////////////////////////////////////
	
	public ConnectionInfoList() 
	{
	}
	
	////////////////////////////////////////////////
	// getConnectionInfo
	////////////////////////////////////////////////
	
	public ConnectionInfo getConnectionInfo(int n)
	{
		return (ConnectionInfo)get(n);
	}


}


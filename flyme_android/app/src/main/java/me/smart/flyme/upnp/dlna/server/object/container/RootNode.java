/******************************************************************
*
*	MediaServer for CyberLink
*
*	Copyright (C) Satoshi Konno 2003
*
*	File : ContentRoot
*
*	Revision:
*
*	10/28/03
*		- first revision.
*
******************************************************************/

package me.smart.flyme.upnp.dlna.server.object.container;

public class RootNode extends ContainerNode
{
	////////////////////////////////////////////////
	// Constroctor
	////////////////////////////////////////////////
	
	public RootNode()
	{
		setID(0);
		setParentID(-1);
		setTitle("Root");
	}

}


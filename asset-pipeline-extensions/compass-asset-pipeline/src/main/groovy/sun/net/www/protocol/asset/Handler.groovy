package sun.net.www.protocol.asset


import groovy.transform.CompileStatic

@CompileStatic
public class Handler extends URLStreamHandler
{
	@Override
	protected URLConnection openConnection(URL u)
	throws IOException
	{
		return new AssetConnection(u);
	}
}

/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package mx.com.inscitech.clients.negocio;
    
import com.rsa.authagent.authapi.AuthAgentException;
import com.rsa.authagent.authapi.AuthSession;
import com.rsa.authagent.authapi.AuthSessionFactory;

public class AutenticaUsuario
{
    private AuthSessionFactory api = null;
	private int salida=AuthSession.ACCESS_DENIED;    
    public int autenticaUsu(String ruta,String ClaveUsuario,String passCode) throws Exception
    {
        try
        {
            api = AuthSessionFactory.getInstance(ruta);
            salida = autentica(ClaveUsuario,passCode);
        }
        catch (AuthAgentException e)
        {
            System.out.println ("No se pudo crear la Api de RSA: " + e.getMessage());
            throw e;
        }
        finally
        {
            if (api != null)
                api.shutdown();
        }
        return salida;
    }
    private int autentica(String ClaveUsuario,String passCode) throws Exception
    {
        AuthSession session=null;
        int status = AuthSession.ACCESS_DENIED;

		try
		{
	        session = api.createUserSession();
	        
	        status = session.lock(ClaveUsuario);
	        status = session.check(ClaveUsuario, passCode);
		}
        catch (AuthAgentException e)
        {
            System.out.println ("Ocurrio un error al Autenticar al Usuario en RSA: " + e.getMessage());
            throw e;
        }
		finally{
			if(session != null) session.close();
		}
        return status;
    }

    public int sincronizaToken(String ruta,String ClaveUsuario,String passCode,String nextPassCode) throws Exception
    {
        AuthSession session=null;
        int status = AuthSession.ACCESS_DENIED;

		try
		{
            api = AuthSessionFactory.getInstance(ruta);

	        session = api.createUserSession();
	        
	        status = session.lock(ClaveUsuario);
	        status = session.check(ClaveUsuario, passCode);
	        status = sincroniza(nextPassCode,session);
	        System.out.println("Status del nextcode"+status);
		}
        catch (AuthAgentException e)
        {
            System.out.println ("Ocurrio un error al Autenticar al Usuario en RSA: " + e.getMessage());
            throw e;
        }
		finally{
			if(session != null) session.close();
            if (api != null)  api.shutdown();
		}
        return status;
    }
        
    protected  int sincroniza(String codigoToken,AuthSession session)  throws Exception
    {
        int status = AuthSession.NEXT_CODE_BAD;

		try
		{
            NextCodeSession nextCode = new NextCodeSession(session);
            status = nextCode.process(codigoToken);
		}
        catch (AuthAgentException e)
        {
            System.out.println ("Ocurrio un error al Sincronizar el Token " + codigoToken + " en RSA: " + e.getMessage());
            throw e;
        }
        finally{
   	            return status;  
        }  	
    }
    
    
}

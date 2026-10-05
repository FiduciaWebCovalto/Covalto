/*
  @Autor:Inscitech
  @Creado: Junio 2008
*/

package  mx.com.inscitech.clients.negocio;

import com.rsa.authagent.authapi.AuthSession;

/**
 * This class handles the Next Tokencode mode of a user's session.
 */
public class NextCodeSession
{
    private AuthSession session;

    protected NextCodeSession(AuthSession session)
    {
        this.session = session;
    }

    /**
     * Processes the next tokencode of a user.
     * @return the status of the next tokencode
     * @throws Exception
     */
    public int process(String nextCode) throws Exception
    {
        return session.next(nextCode);
    }

}

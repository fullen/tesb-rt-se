
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

import org.talend.esb.sts.provider.SecurityTokenServiceImplDelegate;

/**
 * This class was generated by Apache CXF 2.4.0-SNAPSHOT
 * 2011-01-06T10:25:02.224+02:00
 * Generated source version: 2.4.0-SNAPSHOT
 * 
 */

@javax.jws.WebService(
                      serviceName = "SecurityTokenServiceProvider",
                      portName = "SecurityTokenServiceSOAP",
                      targetNamespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512/wsdl",
                      wsdlLocation = "ws-trust-1.4-service.wsdl",
                      endpointInterface = "org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl.SecurityTokenService")
                      
public class SecurityTokenServiceImpl implements SecurityTokenService {

    private static final Logger LOG = Logger.getLogger(SecurityTokenServiceImpl.class.getName());
    SecurityTokenServiceImplDelegate dlg = new SecurityTokenServiceImplDelegate(); 
    /* (non-Javadoc)
     * @see org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl.SecurityTokenService#keyExchangeToken(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType  request )*
     */
    public org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType keyExchangeToken(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType request) { 
        LOG.info("Executing operation keyExchangeToken");
        System.out.println(request);
        try {
            org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl.SecurityTokenService#issue(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType  request )*
     */
    public org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseCollectionType issue(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType request) { 
        LOG.info("Executing operation issue");
        System.out.println(request);
        try {
            org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseCollectionType _return = null;
            _return = dlg.issue(request);
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl.SecurityTokenService#cancel(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType  request )*
     */
    public org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType cancel(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType request) { 
        LOG.info("Executing operation cancel");
        System.out.println(request);
        try {
            org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl.SecurityTokenService#validate(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType  request )*
     */
    public org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType validate(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType request) { 
        LOG.info("Executing operation validate");
        System.out.println(request);
        try {
            org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl.SecurityTokenService#requestCollection(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenCollectionType  requestCollection )*
     */
    public org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseCollectionType requestCollection(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenCollectionType requestCollection) { 
        LOG.info("Executing operation requestCollection");
        System.out.println(requestCollection);
        try {
            org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseCollectionType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.oasis_open.docs.ws_sx.ws_trust._200512.wsdl.SecurityTokenService#renew(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType  request )*
     */
    public org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType renew(org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenType request) { 
        LOG.info("Executing operation renew");
        System.out.println(request);
        try {
            org.oasis_open.docs.ws_sx.ws_trust._200512.RequestSecurityTokenResponseType _return = null;
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

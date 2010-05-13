package org.mule.module.launcher;

import org.mule.api.MuleContext;

/**
 *
 * @param <M> - meta data class type
 */
public interface Deployer<M>
{
    void install() throws InstallException;

    void init();

    void start() throws DeploymentStartException;

    void stop();

    void dispose();

    void setMetaData(M metaData);

    M getMetaData();

    MuleContext getMuleContext();
}

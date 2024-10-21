package org.IFOSRS;

public interface PlayerComposite extends ClientWrapper
{
    /**
     * @return Gets the animated model ID of the player for which the player composite was created
     */
    long getAnimatedModelId();

    int[] getAppearance();

    int[] getBodyColors();

    int getGender();

    int getNPCID();

    java.lang.Object getReference();

    /**
     * @return Gets the static model ID of the player for which the player composite was created
     */
    long getStaticModelId();

}

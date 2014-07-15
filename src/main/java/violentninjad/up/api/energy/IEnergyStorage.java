package violentninjad.up.api.energy;
//Copyright ViolentNInjaD 2014

public interface IEnergyStorage {

    int receiveEnergy(int maxEnergyStorage, boolean isOtherPowerAllowed);

    int extractEnergy(int maxEnergyExtractable, boolean usOtherPowerAllowedExtract);

    int getEnergyStored();

    int getMaxEnergyStored();

}

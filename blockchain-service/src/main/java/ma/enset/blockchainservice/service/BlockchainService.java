package ma.enset.blockchainservice.service;


import ma.enset.blockchainservice.entities.Block;
import ma.enset.blockchainservice.entities.Blockchain;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface BlockchainService {
    Blockchain save(Blockchain blockchain)throws NoSuchAlgorithmException;
    Blockchain getBlockchain(String id);
    List<Blockchain> getBlockchains();
    Blockchain update(Blockchain blockchain);
    void addBlockToBlockChain(Blockchain blockchain,Block block)throws NoSuchAlgorithmException;
    Block getLastBlockInBlockChain(Blockchain blockchain);
}

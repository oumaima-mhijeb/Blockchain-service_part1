package ma.enset.blockchainservice;

import ma.enset.blockchainservice.entities.Block;
import ma.enset.blockchainservice.entities.Blockchain;
import ma.enset.blockchainservice.entities.Transaction;
import ma.enset.blockchainservice.service.BlockService;
import ma.enset.blockchainservice.service.BlockchainService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class BlockchainServiceApplication implements CommandLineRunner{
    private BlockService blockService;
    private BlockchainService blockchainService;

    public BlockchainServiceApplication(BlockService blockService, BlockchainService blockchainService) {
        this.blockService = blockService;
        this.blockchainService = blockchainService;
    }

    public static void main(String[] args) {
        SpringApplication.run(BlockchainServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Blockchain blockchain=blockchainService.save(
                new Blockchain(UUID.randomUUID().toString(),"blockchaine01",4,0,null));

        List<Transaction> transactions=new ArrayList<>();

        transactions.add(new Transaction(UUID.randomUUID().toString(),new Date(),"source1","dest1",1000));
        transactions.add(new Transaction(UUID.randomUUID().toString(),new Date(),"source2","dest2",2000));
        transactions.add(new Transaction(UUID.randomUUID().toString(),new Date(),"source3","dest3",4000));
        Block block=new Block(UUID.randomUUID().toString(),new Date(),null,null,transactions,0);
        blockchainService.addBlockToBlockChain(blockchain,block);
    }
}
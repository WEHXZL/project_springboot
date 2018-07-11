package com.bdqn.sbproject.dao.impl;

import com.bdqn.sbproject.dao.MachineDao;
import com.bdqn.sbproject.pojo.Machine;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("machineDao")
public class MachineDaoImpl implements MachineDao {

    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    public void insertMachine(Machine machine) {
        this.mongoTemplate.insert(machine);
    }

    @Override
    public void updateMachine(Machine machine) {
        this.mongoTemplate.save(machine);
    }

    @Override
    public void deleteMachine(Integer id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        this.mongoTemplate.remove(query,Machine.class);

    }

    @Override
    public Machine selectMachineById(Integer id) {
        return this.mongoTemplate.findById(id,Machine.class);
    }

    @Override
    public List<Machine> selectMachineAll() {
        return this.mongoTemplate.findAll(Machine.class);
    }
}

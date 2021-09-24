package com.sb.j.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sb.j.entity.Player;

@Repository
public interface PlayerDao extends JpaRepository<Player, Integer>{

//	Boolean findByName(String name);
	List<Player> findByName(String name);
}

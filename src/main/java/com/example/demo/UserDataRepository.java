//Day23_顧客データ（インターフェースの作成）
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataRepository extends
	JpaRepository<UserData, Long>{
	}	



package cn.homyit.onlineLeaveSystem.eneity.DO;


import cn.homyit.onlineLeaveSystem.myEnum.ExamineEnum;
import cn.homyit.onlineLeaveSystem.myEnum.LeaveEnum;
import cn.homyit.onlineLeaveSystem.myEnum.LevelEnum;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleNote implements Serializable {
  private static final long serialVersionUID = -40356785423868311L;
  @TableId(type = IdType.AUTO)
  private Long id;
  private Long studentNumber;
  private String majorAndClass;
  private String username;
  private Date startTime;

  private LeaveEnum depart;
  private String days;
  @TableLogic
  private Integer deleted;

  private ExamineEnum examine;

  private LevelEnum level;
}

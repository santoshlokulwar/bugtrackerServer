package com.bugtracker.bugtracker.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BUG_INFO")
public class BugInfo {
    @Id
    @Column(name = "bug_id")
    private Long id;
    @Column(name = "bug_info")
    private String info;
    @Column(name = "attachment")
    private String attachment;
    @Column(name = "user_id")
    private Long user_id;
}

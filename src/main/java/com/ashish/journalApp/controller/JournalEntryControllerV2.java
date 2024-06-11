package com.ashish.journalApp.controller;

import com.ashish.journalApp.entity.JournalEntry;
import com.ashish.journalApp.repository.JournalEntryRepo;
import com.ashish.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;
    @GetMapping
    public List<JournalEntry> getAll(){
        return null;

    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntryById(@PathVariable Long myid)
    {
        return null;

    }
    @DeleteMapping("id/{myid}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myid)
    {
        return null;
    }
    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry )
    {
        return null;
    }
}

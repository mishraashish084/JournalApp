package com.ashish.journalApp.controller;

import com.ashish.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

@RestController
@RequestMapping("/Journal")//Request Mapping because this Annotation apply on all the Methods in this class
public class JournalEntryController {
    private Map <Long, JournalEntry> journalEntries=new HashMap<>();
    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());

    }
  @PostMapping
  public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(),myEntry);
        return true;
    }
    @GetMapping("id/{myid}")
    public JournalEntry getJournalEntryById(@PathVariable Long myid)
    {
        return journalEntries.get(myid);
    }
    @DeleteMapping("id/{myid}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myid)
    {
        return journalEntries.remove(myid);
    }
 @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry )
 {
     return journalEntries.put(id, myEntry);
 }
}

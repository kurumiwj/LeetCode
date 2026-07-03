// 127. 单词接龙
package main

import (
	"github.com/emirpasic/gods/queues/arrayqueue"
	"github.com/emirpasic/gods/sets/hashset"
)

func ladderLength(beginWord string, endWord string, wordList []string) int {
	visited := hashset.New()
	workSet := hashset.New()
	for _, word := range wordList {
		workSet.Add(word)
	}
	if !workSet.Contains(endWord) {
		return 0
	}
	q := arrayqueue.New()
	q.Enqueue(beginWord)
	path := 1
	var changeLetter func(word string) bool
	changeLetter = func(word string) bool {
		for i, _ := range word {
			for j := 'a'; j <= 'z'; j++ {
				newWord := make([]rune, len(word))
				copy(newWord, []rune(word))
				newWord[i] = j
				if string(newWord) == endWord {
					return true
				}
				if workSet.Contains(string(newWord)) && !visited.Contains(string(newWord)) {
					visited.Add(string(newWord))
					q.Enqueue(string(newWord))
				}
			}
		}
		return false
	}
	for q.Size() > 0 {
		size := q.Size()
		for i := 0; i < size; i++ {
			word, _ := q.Dequeue()
			if changeLetter(word.(string)) {
				return path + 1
			}
		}
		path++
	}
	return 0
}

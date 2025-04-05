package com.batory.renamecommitplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages.showInputDialog
import git4idea.commands.Git
import git4idea.commands.GitCommand
import git4idea.commands.GitLineHandler
import git4idea.repo.GitRepositoryManager

class RenameCommitAction: AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        if (e.project == null) return
        val newCommitName = showInputDialog(
            e.project,
            "Enter new commit name",
            "Rename Commit",
            null
        ) ?: return
        val repositoryManager = GitRepositoryManager.getInstance(e.project!!)
        val repository = repositoryManager.repositories[0]
        val gitRoot = repository.root

        val handler = GitLineHandler(e.project, gitRoot, GitCommand.COMMIT)
        handler.addParameters("--amend", "--only", "-m", newCommitName)

        Git.getInstance().runCommand(handler)
    }
}
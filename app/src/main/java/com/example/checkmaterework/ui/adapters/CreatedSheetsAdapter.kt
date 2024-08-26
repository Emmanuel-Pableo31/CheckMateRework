package com.example.checkmaterework.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.checkmaterework.R

data class CreatedSheet (val text: String)

class CreatedSheetsAdapter(private val createdSheets: List<CreatedSheet>): RecyclerView.Adapter<CreatedSheetsAdapter.CreatedSheetViewHolder>() {
    class CreatedSheetViewHolder(createdSheetView: View): RecyclerView.ViewHolder(createdSheetView) {
        val createdSheetName: TextView = createdSheetView.findViewById(R.id.createdSheetName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CreatedSheetViewHolder {
        val createdSheetView = LayoutInflater.from(parent.context).inflate(R.layout.layout_created_sheets, parent, false)
        return CreatedSheetViewHolder(createdSheetView)
    }

    override fun getItemCount(): Int {
        return createdSheets.size
    }

    override fun onBindViewHolder(holder: CreatedSheetViewHolder, position: Int) {
        val createdSheets = createdSheets[position]
        holder.createdSheetName.text =createdSheets.text
    }
}
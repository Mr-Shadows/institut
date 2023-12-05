#include <iostream>
#include <fstream>
#include <string>
#include <vector>

using namespace std;

const int maxLizensies = 10;

//регистрационная структура
struct Registr
{
    string lizensienNumber;
    string companyName;
    string founder;
    bool lizenseValidityIndication;

    void writeToFile(ofstream& file) const
    {
        file << lizensienNumber << endl;
        file << companyName << endl;
        file << founder << endl;
        file << (lizenseValidityIndication ? "0" : "1") << endl;
    }

    void ReadToFile(ifstream& file)
    {
        getline(file, lizensienNumber);
        getline(file, companyName);
        getline(file, founder);

        string lizenseValidityIndicationStr;

        getline(file, lizenseValidityIndicationStr);

        lizenseValidityIndication = (lizenseValidityIndicationStr == " 0");
    }
};

void createListOfLizensies(const vector<Registr>& registrations, const string& foundNumber)
{
    ofstream outputFile("registr.txt");
    if(!outputFile)
    {
        cout << "No file!" << endl;
        return;
    }

    for (const auto& reg : registrations)
    {
        if (reg.founder == foundNumber)
        {
            reg.writeToFile(outputFile);
        }
    }

    outputFile.close();
}

int main()
{

}